public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Pirma uzduotis. Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.");
        for (int i = 0; i < 10; i++) {
            System.out.println("Labas");
        }

        System.out.println();
        System.out.println("Antra uzduotis.Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9. ");
        for (int a = 0; a < 10; a++) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Trecia uzduotis. Sukurkite masyvą iš dešimties augalų pavadinimų.");
        String[] augalai = {"Linas", "Alyva", "Pomidoras", "Paprika", "Roze", "Agrastas", "Kopustas", "Berzas", "Egle", "Dilgele"};

        System.out.println();
        System.out.println("Ketvirta Uzduotis. Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.");
        for (int b = 0; b < augalai.length; b++) {
            System.out.println(augalai[b]);
        }

        System.out.println();
        System.out.println("Penkta Uzduotis. Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).");
        for (int c = augalai.length - 1; c >= 0; c--) {
            System.out.println(augalai[c]);
        }

        System.out.println();
        System.out.println("Sesta uzduotis. Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius)");
        for (int d = 10; d < 51; d++) {
            System.out.println(d);
        }

        System.out.println();
        System.out.println("Septinta uzduotis. Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius) " +
                "Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite. ( naudokite continue.) " +
                "(atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos.");
        for (int e = 10; e < 51; e++) {
            if (e % 10 == 0) {
                continue;
            }
            if (e % 2 == 0) {
                System.out.println(e);
            }
        }

        System.out.println();
        System.out.println("Astunta uzduotis. Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę.");
        int poriniai = 0;
        for (int f = 0; f < 21; f++) {
            if (f % 2 == 0) {
                poriniai++;
                System.out.println(f);
            }
        }
        System.out.println("Atsakymas" + " " + poriniai);

        System.out.println();
        System.out.println("Devinta uzduotis. Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai, " +
                "ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)");
        int trumpi = 0;
        int ilgi = 0;
        for (int i = 0; i < augalai.length; i++) {
            if (augalai[i].length() < 5) {
                trumpi++;
                System.out.println(augalai[i]);
            }

            if (augalai[i].length() > 7) {
                ilgi++;
                System.out.println(augalai[i]);
            }
        }
        System.out.println();
        System.out.println("Trumpi" + " " + trumpi);
        System.out.println("Ilgi" + " " + ilgi);

        System.out.println();
        System.out.println("Desimta uzduotis. Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet trumpesnių  nei 10 simboliai. " +
                "(tarp 5 ir 10 simbolių ilgio)");

        int vidutiniai = 0;
        for (int i = 0; i < augalai.length; i++) {
            if (augalai[i].length() > 5 && augalai[i].length() < 10) {
                vidutiniai++;
                System.out.println(augalai[i]);
            }
        }
        System.out.println("Vidutiniai" + " " + vidutiniai);

        System.out.println();
        System.out.println("Sunkesne pirma. Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos atskirtus tarpais ir " +
                "suskaičiuokite kiek tarp jų yra didesnių už 150.  Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.");
        System.out.println();

        int min = 0;
        int max = 300;
        int kiekis = 0;
        int midi = 0;

        for (int i = 0; i < 300; i++) {
            int skaicius = (int) (Math.round(Math.random() * max - min) + min);
            kiekis++;
            if (skaicius > 275) {
                System.out.print("[" + skaicius + "]; ");
            } else System.out.print(skaicius + "; ");
            if (skaicius > 150) {
                midi++;
            }
        }
        System.out.println();
        System.out.println("Is viso sugeneruota - " + kiekis);
        System.out.println("Mazesniu nei 150 - " + midi);

        System.out.println();
        System.out.println("Sunkesne antra. Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, " +
                "kurie dalijasi iš 77 be liekanos. Skaičius atskirkite kableliais. Po paskutinio skaičiaus kablelio neturi būti.");
        System.out.println();

        for (int i = 1; i < 3000; i++) {
            if (i % 77 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Sunkesne trecia. Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”");
        System.out.println("Sunkesne ketvirta. Prieš tai nupieštam kvadratui nupieškite istrižaines zaigzdutę pakeisdami kitu simboliu.");
        System.out.println();
        int line = 11;
        for (int i = 0; i < line; i++) {
            for (int a = 0; a < line; a++) {
                if (a == i || line - a == i + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println();
        System.out.println("Sunkesne penkta. Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija, kur 0 yra herbas, o 1 - skaičius. " +
                "Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje: “S” jeigu iškrito skaičius ir “H” jeigu herbas. " +
                "Suprogramuokite tris skirtingus scenarijus kai monetos metimą stabdome:" +
                "Iškritus herbui;" +
                "Tris kartus iškritus herbui;" +
                "Tris kartus iš eilės iškritus herbui;");
        System.out.println();
        System.out.println("Metimas");
        boolean drop = true;
        while (drop) {
            int moneta = (int) (Math.round(Math.floor(Math.random() * 2)));
            if (moneta == 0) {
                drop = false;
            }
            if (moneta == 1) {
                System.out.println("S");
            } else {
                System.out.println("H");
            }
        }
        System.out.println();
        System.out.println("Metam 3 H");
        int herbas = 0;
        boolean drop2 = true;
        while (drop2) {
            int moneta = (int) (Math.round(Math.floor(Math.random() * 2)));

            if (moneta == 1) {
                herbas++;
                System.out.print("H");
            } else {
                System.out.print("S");
            }
            if (herbas == 3) {
                break;
            }

        }
        System.out.println();
        System.out.println();
        System.out.println("Metam 3 H iš eilės");

        int herbas3 = 0;
        boolean drop3 = true;
        while (drop3) {
            int moneta = (int) (Math.round(Math.floor(Math.random() * 2)));
            if (moneta == 0) {
                System.out.print("H");
                herbas3++;
            }
            if (moneta == 1) {
                herbas3 = 0;
                System.out.print("S");
            }
            if (herbas3 == 3) {
                break;
            }
        }


        System.out.println();
        System.out.println("Sunkesnė šešta. Kazys ir Petras žaidžia šaškėm. Petras surenka taškų kiekį nuo 10 iki 20, Kazys surenka taškų kiekį nuo 5 iki 25. " +
                "Vienoje eilutėje išvesti žaidėjų vardus su taškų kiekiu ir “Partiją laimėjo: laimėtojo vardas”. " +
                "Taškų kiekį generuokite funkcija Math.random(). Žaidimą laimi tas, kas greičiau surenka 222 taškus. " +
                "Partijas kartoti tol, kol kažkuris žaidėjas pirmas surenka 222 arba daugiau taškų.");

        System.out.println();

        int petrasviso = 0;
        int kazysviso = 0;
//        petras nuo 10 iki 20
//        kazys nuo 5 iki 25

        boolean game = true;
        while (game) {
            int petras1 = (int) (Math.round(Math.random() * (20 - 10)) + 10);
            petrasviso += petras1;
            // petrasviso = petrasviso + petras1;
            System.out.print("Petras " + petras1 + "; ");
            int kazys1 = (int) (Math.round(Math.random() * 25 - 5) + 5);
            kazysviso += kazys1;
            System.out.print("Kazys " + kazys1 + "; ");
            if (petras1 > kazys1) {
                System.out.print("Partija laimejo: Petras. ");
            } else {
                System.out.print("Partija laimejo Kazys. ");
            }

            if (petrasviso > 221 || kazysviso > 221) {
                game = false;
                System.out.println();
                System.out.println(petrasviso + " " + kazysviso);
            }

        }
        if (petrasviso == kazysviso) {
            System.out.println("Zaidimas baigesi lygiosiomis");
        }
        if (petrasviso > kazysviso) {
            System.out.println("Zadima laimejo Petras " + petrasviso);
        }

        if (kazysviso > petrasviso) {
            System.out.println("Zadima laimejo Kazys " + kazysviso);
        }

        System.out.println();
        System.out.println("Sunkesne septinta. Reikia nupaišyti pilnavidurį rombą, taip pat, kaip ir pilnavidurį kvadratą" +
                " kurio aukštis 21 eilutė.");
        System.out.println(" ");


        System.out.println();
        System.out.println("Sunkesne astunta. Sumodeliuokite vinies kalimą. Įkalimo gylį sumodeliuokite pasinaudodami Math.random() funkcija. " +
                "Vinies ilgis 8.5cm (pilnai sulenda į lentą)." +
                "“Įkalkite” 5 vinis mažais smūgiais. Vienas smūgis vinį įkala 5-20 mm. Suskaičiuokite kiek reikia smūgių." +
                "“Įkalkite” 5 vinis dideliais smūgiais. Vienas smūgis vinį įkala 20-30 mm, bet yra 50% tikimybė " +
                "(pasinaudokite Math.random() funkcija tikimybei sumodeliuoti), kad smūgis nepataikys į vinį. Suskaičiuokite kiek reikia smūgių.");
        System.out.println(" ");

        int vinis = 85;

        System.out.println();
        System.out.println("Mazi smugiai");

        for (int i = 0; i < 5; i++) {
            int msmugiai = 0;
            int sukalta = 0;

            boolean smugis = true;
            while (smugis) {
                int mazas = (int) (Math.round(Math.random() * (20 - 5)) + 5);
                sukalta += mazas;
                msmugiai++;
                System.out.print(mazas + ", ");
                if (sukalta >= vinis) {
                    break;
                }
            }
            System.out.println();
            System.out.println(msmugiai);
        }

        System.out.println();
        System.out.println("Dideli smugiai");

        int visosmugiu = 0;
        for (int i = 0; i < 5; i++) {
            int dsmugiai = 0;
            int sukalta = 0;

            boolean smugis = true;
            while (smugis) {
                int tikimybe = (int) Math.round(Math.random() * 1);
                if (tikimybe < 1) {
                    continue;
                } else {
                    System.out.print("Nepataike, ");
                }
                int didelis = (int) (Math.round(Math.random() * (30 - 20)) + 20);
                sukalta += didelis;
                dsmugiai++;


                System.out.print(didelis + ", ");
                if (sukalta >= vinis) {
                    visosmugiu += dsmugiai;
                    break;
                }
            }
            System.out.println();
            System.out.println(dsmugiai);
        }

        System.out.println("viso smugu " +   visosmugiu );

        System.out.println("pa vy ko!");
        System.out.println("dar vienas dalykelis");
        //pabaiga


    }
}