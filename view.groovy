def jobList = ["Job in View 1", "job in View 2"]
jobList.each {
    def name = it
    job(name) {
        steps {
            shell("echo $name")
        }
    }
}

listView('View from Job DSL') {
    jobs {
        jobList.each {
            name(it)
        }
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}