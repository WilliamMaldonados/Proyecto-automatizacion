# Autor: William Maldonado

@stories
Feature: user registration on page utest

  @scenario1

  Scenario: user registration on page utest
    Given than william want register in utest
    When he enters the data into the form
    | strNAME |  strLAST_NAME | strEMAIL | strMONTH | strDAY | strYEAR | strCITY | strZIP | str COUNTRY |
    | william | Maldonado | prueba@utest.com | June | 5  | 1994        | Bogota |  55555 | Colombia    |
    Then registration is complete when we see the complete setup button