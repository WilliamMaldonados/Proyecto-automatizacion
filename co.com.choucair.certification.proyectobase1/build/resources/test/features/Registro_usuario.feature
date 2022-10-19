# Autor: William Maldonado

@stories
Feature: user registration on page utest

  @scenario1

  Scenario: user registration on page utest
    Given than william want register in utest
    When he enters the data into the form
      | strNAME |  strLAST_NAME | strEMAIL | strMONTH | strDAY | strYEAR | strCITY | strZIP | str COUNTRY | strDEVICE | strMOVIL | strOS | strPASSWORD |
      | william | Maldonado | prueba@utest.com | June | 5  | 1994        | Bogota |  55555 | Colombia    | Apple      |  iPhone 11 Pro | iOS 16.0 | Contraseñadeprueba123|
    Then registration is complete when we see the complete setup button