package paralleltemplaterendering

class DemoController {

    def index() {
        def resultList = []
        resultList << [name: 'Geddy Lee', instrument: 'Bass']
        resultList << [name: 'Neil Peart', instrument: 'Drums']
        resultList << [name: 'Alex Lifeson', instrument: 'Guitar']

        [resultList: resultList]
    }
}
