#Autor: John Villamil

@Stories1
Feature: Maxtime
  As a user, I want to report my times in maxtime
  Background:
    Given than John wants to register a new record in Maxtime
    And he needs go to login with his credentials
      |username      |password         |
      |jvillamilg |Thelightimusic77 |

  Scenario Outline: Generate a new report in Maxtime
    And he go to select the record with the last date
    And creates a new detailed report
    When he is in the detailed report section he will fill in the fields
      |proyecto    |tipo_hora   |servicio   |actividad   |horas_ejecutadas   |comentario   |
      |<proyecto>    |<tipo_hora> |<servicio> |<actividad> |<horas_ejecutadas> |<comentario> |
    Then he will verify that the <proyecto> the <servicio> the <tipo_hora> the <actividad> the <horas_ejecutadas> and the <comentario> is found

    Examples:
      |proyecto                      |tipo_hora  |servicio                   |actividad      |horas_ejecutadas |comentario                      |
      |Varios Choucair Bogotá Banking|H. Choucair|pruebas generales clásicas |FORMACIÓN GUÍAS|9                |Reto: Automatizacion de Maxtime |
