# hikaku - Config

The following is a list of configurations.

| config parameter | since | default value           | description                                                                                                                                                                                                                                |
|------------------|-------|-------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| filters          | 3.0.0 | `emptyList()`           | Endpoints matching the predicates in this list will be excluded from matching.                                                                                                                                                             |
| reporters        | 1.0.0 | `CommandLineReporter()` | A reporter receives the match results before the assertion is called. Default value is the `CommandLineReporter` which simply prints the results to command line. Another built-in option is the `NoOperationReporter` which does nothing. |
