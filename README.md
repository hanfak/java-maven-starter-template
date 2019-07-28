Fill as necessary

# Template for java projects

This is a starter template for a java project. Can be used for doing simple programs/tech tests or starting point for doing an application

This includes the following

- Static Analysis tools 
    - find bugs (errors)
    - pmd (style)
    - jacoco (code coverage)
- failsafe
    - for running acceptance tests (unit/integration/end to end) and not failing build if one test fails
- Dependencies 
    - Junit 4 for testing
    - AssertJ for assertion library
    - Yatspec for writing acceptnace tests, table tests, html output of tests


## Common commands 

This uses maven

- mvn clean test
- mvn clean verify (creates jar)
        