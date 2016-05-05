Aby bylo možné použít nástroj Java API compliance checker (JAPICC) je nutné mít nainstalovaný perl.

Složka "reports" obsahuje vygenerované reporty jednotlivých nástrojù
složka "test_lib" obsahuje testovací knihovny 
pro nástroje jour a sigtest je zapotøebí nahrát do složky "test_lib" i knihovnu "rt.jar", která se defaultnì nachází v instalaci Javy ve složce JRE/lib.
Popøípadì je nutné upravit spouštìcí soubory, aby v classpath byla skuteèná cesta k této knihovnì.

soubor: "runTools.bat" - spustí postupnì všechny nástroje a vygeneruje reporty do pøipravené složky "reports"

Ostatní složky jsou jednotlivé nástroje + spouštìcí soubory pro pøípadné spuštìní samotného nástroje
