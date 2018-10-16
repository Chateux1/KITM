1. Sukurkite naujus Linux OS vartotojus vardu moksleivis ir mokytojas. Suteikite jiems namų
katalogus vardu moksleivis, mokytojas
2. Sukurkite grupe mok. Priskirkite pagrindinę namų grupę mok ir papildomas grupes
lp,kospusas1,korpusas2 vartotojams, bei nustatykite vartotojų shell apvalkalą bash. Suteikite
vartotojams slaptažodį kitm.
3. Sukurtus vartotojus priskirkite prie papildomų grupių sudo ir mokykla. Patikrinkite kokioms
grupės priklauso sukurtas vartotojas moksleivis.
==============================================================================================

	* sudo groupadd mok (mokykla, lp, kp1)
	* sudo useradd -g mok -G lp, kp1, kp2, sudo, mokykla, -s /bin/bash user_name
	* sudo passwd mokytojas
	* grep moksleivis /etc/group

4. Prisijunkite prie Linux sistemos su vartotoju mokytojas ir patikrinkite kas yra prisijungęs prie
sistemos.

	sudo -u mokytojas bash
	who -a

5. Vartotojo mokytojas darbalaukyje sukurkite katalogą Uzduotys. Sukurtame kataloge sukurkite
failus vartotojai.txt ir failas.txt. Nukopijuokite failo /etc/passwd turinį į sukurtą failą
vartotojai.txt ir padarykite failo /etc/group kopiją į katalogą Uzduotys.

	sudo -u mokytojas bash
	sudo mkdir Uzduotys
	sudo touch vartotojai.txt
	sudo touch failas.txt
	sudo cp 

12. Išveskite į ekraną visus OS procesus. Visų procesų sąrašą išsaugokite faile procesai.txt (kataloge
Uzduotys).

	ps -A > ~/Uzduotys/procesai.txt

13. Išveskite į ekraną visus esamo vartotojo mokytojas procesus. Vartotojo procesų sąrašą išsaugokite faile proc-mokytojas.txt (kataloge Uzduotys). Failus procesai.txt ir procmokytojas.txt sudėkite į archyvą vardu proc.tar.gz.

	ps -u mokytojas > ~/Uzduotys/proc-mokytojas.txt
	sudo tar -czvf ~/Uzduotys/proc.tar.gz procesai.txt procmokytojas.txt

14. Išarchyvuokite iš archyvo proc.tar.gz tik failą proc-mokytojas.txt į katalogą ~/Uzduotys/mano.

	sudo tar -xvzf proc.tar.gz proc-mokytojas.txt -C ~/Uzduotys/mano

15. Su apt-cache įrankiu suraskite programinį paketą mc. Su apt-get įrankių įdiekite (install) surastą paketą į sistemą. Patikrinkite mc programinio paketo darbą.

	sudo apt-cache md
	sudo apt-get install md
	mc
	exit

16. Sukurkite bash scenarijų (script), kuris atnaujina sistemą ir paleidžia naršyklę firefox.

	echo "#! /bin/bash" > test.sh
	echo "firefox" >> test.sh
	sh test.sh
	chmod +x ./test.sh
	./test.sh

17. Išveskite į ekraną savo Linux sistemos tinklo plokštės IP ir MAC adresus. Gautą informaciją įrašykite į failą ~/Uzduotys/ether.txt.

	lshw -class network > ~/Uzduotys/ether.txt

18. Patikrinkite ar Linux sistemoje veikia Apache web serveris

	http://localhost
	sudo systemctl status apache2

19. Sukonfiguruokite WEB serverį taip, kad jis galėtų talpinti svetainę web1.com. Svetainės talpinimo katalogas /var/www/web1. Atidarius naršyklėje svetainę web1.com turi būti matomas užrašas „O, tai tikrai VEIKIA!“.

	sudo apt-get install apache2
	sudo mkdir /var/www/pavadinimas
	sudo cp index.html /var/www/pavadinimas
	sudo cp /etc/apache2/sites-avialable/000-default.conf /etc/apache2/sites-avialable/pavadinimas.conf
	nano pavadinimas.conf >>> pakeisti ServerName pavadinimas.com; DocumentRoot /var/www/pavadinimas
	sudo a2ensite pavadinimas
	sudo service apache2 restart
	nano /etc/hosts >>> prideti 127.0.0.1 pavadinimas.com
	firefox >>> http://pavadinimas.com
	
20. Patikrinkite ar Linux sistemoje veikia SSH serveris.

	/etc/init.d/ssh status

21. Iš Windows terpės prisijunkite prie virtualios OS ir patikrinkite kokie vartotojai yra prisijungę prie sistemos. Patikrinkite iš kokio IP adreso yra prisijungęs nutolęs vartotojas.

	netstat -tln >>> :::Nr atviras portas
	netstat -tl >>> [::]:ssh
	ifconfig >>> inet ip.ip.ip.ip
	who