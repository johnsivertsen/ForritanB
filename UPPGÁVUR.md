# Uppgávur

Niðanfyri eru uppgávurnar ið vit loysa og gjøgnumganga.

Legg í mappu EX001, EX002 (osv.) á rótini á Git repository.

## EX001: Dit første program

https://programmering.systime.dk/?id=c351

Fokus á punkt 5

## EX002: Fejl og rettelse i et program   

Kopiera fílur frá frá EX001

https://programmering.systime.dk/?id=c358

Fokus á punkt 5

## EX003: Introduktion til variable

https://programmering.systime.dk/?id=c359

## EX004: setToNextDate

Input til program: Dato við format dd-mm-yyyy

Output input dato + 1 dag.

Skal taka hædd fyri mánaðar og ársskiftum og skotári.

Gjarna commit+push leypandi (kotan skal tó kompilera)

## EX005: Hund

Implementera HUND

https://programmering.systime.dk/?id=c382

## EX006: Algoritme til sum

Loys punkt 2.

https://programmering.systime.dk/?id=c759

## EX007: Glædelig jul og godt nytår

https://programmering.systime.dk/?id=c1095

## EX008: Skudår

Loys punkt 2 og 3.

https://programmering.systime.dk/?id=c1096

## EX009: Investering med fast rente

https://programmering.systime.dk/?id=c1092

## EX010: Gæt et tal mellem 1 og 100

https://programmering.systime.dk/?id=c300

## EX011: Fakultet

https://programmering.systime.dk/?id=c1098

## EX012: Palindrom

https://programmering.systime.dk/?id=c847

Ger punkt 2 nágreiniliga sum lýst

## EX013: Needle in Haystack

https://programmering.systime.dk/?id=c1088

## EX014: Søg i Array

https://programmering.systime.dk/?id=c1089

## EX015: Sortér Array

https://programmering.systime.dk/?id=c1090

Nýt t.d. Bubble Sort: https://en.wikipedia.org/wiki/Bubble_sort

## EX016: Beregning af største fælles divisor

https://programmering.systime.dk/?id=c742

## EX017: Algoritme til at finde personnavn i liste

https://programmering.systime.dk/?id=c757

## EX018: Ger keylistener til JTextField

Tá ið ein av keylistener metodunum verður triggað, broyt bakgrundsfarvuna á text field komponentinum til okkurt random.

```
textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                Log("keyTyped triggered");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                Log("keyPressed triggered");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                Log("keyReleased triggered");
            }
        }
```

# Hanging Man

## Ger getGUI 

Funktión ið tekur loysn (string) og git (lista av teknum) sum input og returnerar strong við spæl GUI í stíl við:

```
Loysn: *o**h**o**i
Git: i,o,j,e,h,l,w
Skeiv git: 4
```

Funktión signatur:
```static String getGUI(String solution, ArrayList<Character> guesses)```

## Skift GetGUI út í johnsivertsen/ForritanB/HangingMan

Tak tí GetGUI ið tú hevur gjørt, og erstatta ta sum er í HangingMan hjá GitHub hjá mær (John).
Úrslitið skal vera at spælið fungerar uppá akkurát sama máta. Einasti munurin er tað sum verður víst er annarleiðis.

Hjálpifunktiónir til at konvertera millum ArrayList og Set:

```
    static ArrayList<Character> ConvertSetToArrayList(Set<Character> characterSet) {
        ArrayList<Character> result = new ArrayList();
        Iterator<Character> iterator = characterSet.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }

    static Set<Character> ConvertArrayListToSet(List<Character> characterList) {
        Set<Character> result = new TreeSet();
        for (int i = 0; i < characterList.size(); i++) {
            result.add(characterList.get(i))
        }
        return result;
    }
    
```

## Eyka

* Ger so at GuessGenerator lesur frá txt fílu frá diskinum
* Ger tað gjørligt at broyta tal av max gitum
* Vís bara skeiv git undir "Git"
* Ger so at steðgað spæl kann takast uppaftur aftaná restart


## EX019: Telefon klassi

Ger ein klassa sum umboðar eina telefon.

Skal innihalda Framleiðara, Model, Skermstødd, EigaraNavn

Ger 3 objektir.

Goym í einum ArrayList.

Loopa gjøgnum listan og skriva upplýsingarnr út. 

## EX020: Car klassi

Ger ein klassa sum umboðar ein bil.

Attributtar: Framleiðari, Model, Motorstødd, EigaraNavn, Ferð // Sí https://www.w3schools.com/java/java_class_attributes.asp

Ger 3 objektir.

Goym í einum ArrayList.

Loopa gjøgnum listan og skriva upplýsingarnr út vha toString();

Ger metodur: koyr, bremsa                                       // Sí https://www.w3schools.com/java/java_class_methods.asp

Um Koyr verður kallað, skal Ferð setast til 50

Um Bremsa verður kallað, skal Ferð setast til 0

Kalla koyr() á allar bilarnar.

Loopa síðan gjøgnum listan og skriva upplýsingarnr út vha toString();

Kalla bremsa() á allar bilarnar.

Loopa síðan gjøgnum listan og skriva upplýsingarnr út vha toString();

