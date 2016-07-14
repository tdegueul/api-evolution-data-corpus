Tato složka obsahuje nástroje používané v Linuxu konkrétnì byl použit Debian 8.4.0 amd64. - testováno ve virtuálním stroji vytvoøeném virtualizaèním nástrojem VMware Workstation 12.1.0

Složka "reports" obsahuje vygenerované reporty jednotlivých nástrojù
složka "test_lib" obsahuje testovací knihovny 
pro nástroj japitools je zapotøebí nahrát do složky "test_lib" i knihovnu "rt.jar", která se defaultnì nachází v instalaci Javy ve složce JRE/lib.
Popøípadì je nutné upravit spouštìcí soubory, aby v classpath byla skuteèná cesta k této knihovnì.

soubor: "runTools.sh" - spustí postupnì všechny nástroje a vygeneruje reporty do pøipravené složky "reports"

Ostatní složky jsou jednotlivé nástroje + spouštìcí soubory pro pøípadné spuštìní samotného nástroje
