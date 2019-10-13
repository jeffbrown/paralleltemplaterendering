package paralleltemplaterendering

class ParallelTemplateTagLib {
    static namespace = 'demo'

    ParallelTemplateHelperService parallelTemplateHelperService

    def parallelTemplates = { attrs ->
        List<Map> players = attrs.players
        List results = parallelTemplateHelperService.renderTemplates players
        results.each { out << it }
    }
}
