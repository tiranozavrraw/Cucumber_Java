#language: en
  Feature: Main Menu Functionality

    Scenario Outline: Sub-menu "Автобарахолка" displayed correctly
      Given Main page is displayed
      When Mouse hover "Автобарахолка" menu item
      Then Sub-menu options are displayed
      And Contains division by <city>, <price> and <brand>
      Examples:
        | city | price | brand |
        | "Минск" | "Цена с НДС" | "Peugeot" |
        | "Гродно" | "Авто до 4000 р." | "Audi" |

    Scenario Outline: Sub-menu "Дома и квартиры" displayed correctly
      Given Main page is displayed
      When Mouse hover "Дома и квартиры" menu item
      Then Sub-menu options are displayed
      And Contains division by <city>, <number of rooms>, <price>
      Examples:
        | city | number of rooms | price |
        | "Минск" | "1-комнатные" | "До 30 000 $" |
        | "Гродно" | "2-комнатные" | "30 000–80 000 $" |

