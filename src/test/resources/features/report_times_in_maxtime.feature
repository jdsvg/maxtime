#Autor: John Villamil

@Stories1
Feature: Maxtime
  As a user, I want to report my times in maxtime
  Background:
    Given than John wants to record a report in Maxtime
    And he needs go to login with his credentials
      |email   |password  |
      |<email> |<password>|

  Scenario Outline: Generate report in Maxtime
    And he go to select the record with the date of the <current_date>
    And he go to create a new detailed report
    When he is in the detailed report section he will fill in the fields
      |proyecto    |tipo_hora   |servicio   |actividad   |horas_ejecutadas   |comentario   |
      |<proyecto>    |<tipo_hora> |<servicio> |<actividad> |<horas_ejecutadas> |<comentario> |
    Then he verifies the information in the new carving report record
    And he is going to close the day

    Examples:
      |current_date   |proyecto                   |tipo_hora   |servicio                   |actividad         |horas_ejecutadas |comentario                      |
      |current_date   |pruebas generales clásicas |H. Choucair |pruebas generales clásicas |formación guías   |9                |Reto: Automatizacion de Maxtime |
