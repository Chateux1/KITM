#T06 Klasių paveldėjimas

##Teorija
1. Kas yra paveldėjimas ir kam jis reikalingas?
2. Kas yra paveldima ir paveldinčioji klasė? Koks skirtumas tarp jų?
3. Kokios galimos paveldimumo schemos?

##Praktika:
1. Sukurti interface Statybininkas pakete 'com.paveldejimas.isvestine' su Statybininko get'erių ir set'erių aprašais (pvz.: void setStazas(double stazas); double getStazas(); ir pan.)
2. Sukurti klasę Statybininkas, paveldinčią interface Statybininkas, pakete 'com.paveldejimas.isvestine':
	* stažas;
	* išsilavinimas;
	* specializacija;
	* atlyginimas.
3. Klasę Zmogus (darėme anksčiau) patalpinti pakete 'com.paveldejimas.bazine'.
4. Klasei Zmogus sukurti interface (galite įmesti į jį pora metodų aprašų, nebūtinai visus) ir patalpinti ten pat.
5. Išvestinė klasė Statybininkas turi paveldėti bazinę klasę Zmogus.
6. Sukurti 4 objektus išvestinės ir 4 objektus bazinės klasės.