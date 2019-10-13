package paralleltemplaterendering

import grails.async.Promise
import grails.async.Promises
import grails.gsp.PageRenderer
import groovy.transform.CompileStatic

@CompileStatic
class ParallelTemplateHelperService {
    PageRenderer groovyPageRenderer

    protected List renderTemplates(List<Map> players) {
        List<Promise> templatePromises = players.collect { Map player ->
            Promises.task {
                groovyPageRenderer.render template: '/templates/player', model: player
            }
        }
        Promises.waitAll templatePromises
    }
}
