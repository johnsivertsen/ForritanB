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

### Part 1

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

### Part 2

Ger Framleiðari klassa.

Attributtar: Navn, Bústaður

Metodur: framleið() ið returnar ein bil. // Sí https://www.w3schools.com/java/java_methods_param.asp

Ger 3 framleiðari objektir.

Skift "new Car()" køllini út við t.d. bmw.framleið(), volvo.framleið() køll.

### Eyka 

Ger metodu: SpeedUp()
* Skal økja ferð við 10 fyri hvørt kall.

Ger metodu: SlowDown()
* Skal minka ferð við 20 fyri hvørt kall.

Fer skal ikki kunna fara niður um 0 ella uppum 200.

Ger kotu ið demonstrerar at hetta riggar.

Ger klassa Person við ArrayList\<Car\> attributti. (Tvs. persónurin eigur bilarnar).

Stovna 5 persónar.

Stovna 10 bilar og fordeil teir millum persónarnar.

Í Person.toString, skriva út hvørjar bilar persónurin eigur.

Ger kotu ið demonstrerar at hetta riggar.
 
## EX021: Swing JFrame, JPanel og Timer

Uppgávunar niðanfyri eru inspireraðar av tí sum vit hava gjøgnumgingið í http://zetcode.com/tutorials/javagamestutorial/

Tvs. at so gott sum allar uppgávurnar kunnu loysast við at granska kotuna á zetcode.com og yvirføra tað.

Commit og push millum hvørja uppgávu.

1) Ger eitt tómt svart vindeyga á stødd 400x300 pixels vha klassum ið arva (extend) frá JFrame og JPanel.

2) Overrida void paintComponent(Graphics g) í JPanel sub-klassanum. og ger egna tekni metodu ið teknar ein gulan tekst á vindeygað, stødd 14pt og centreraðan bæði vertikalt og horizontalt.

3) Broyt 2) til at tekna núvernadi klokkuslett vha t.d. fylgjandi:

```
    Date d = new Date();
    String dateString = d.toString();
```
    
4) Ger timara ið verður triggaður 10. hvørt sekund á JPanel. Hvørja fer hann verður triggaður skal hann kalla repaint() metoduna í JPanel.

5) Ger ein KeyListener a la TAdapter í zetcode. Ger soleiðis at hvørja fer ein tastur verður trýstur, at repaint() verður kallað.

    Hint: fyri at eitt TAdaper objekt skal kunna kalla repaint á JPanel (ella Board subklassa), so má TAdapter hava eina referansu til JPanel.
    Hetta kann gerast við at taka ein parametur við í konstruktaranum: 

```
    private class TAdapter extends KeyAdapter {
        private final JPanel owner;

        public TAdapter(JPanel owner) {
            this.owner = owner;
        }

        @Override
        public void keyReleased(KeyEvent e) {
            owner.repaint();
        }

        @Override
        public void keyPressed(KeyEvent e) {
            owner.repaint();
        }
    }
```



## EX022: DateTimeSprite

1) Ger líka sum í EX021-1 eitt tómt vindeyga. Kalla klassan ið arvar (extends) frá JPanel fyri Board.

2) Ger ein Sprite klassa ið umboðar eitt generelt skap og inniheldur generellar skaps attributtar (x, y, width, height)

3) Ger ein DateTimeSprite klassa ið arvar (extends) frá Sprite. Hann skal hava eina getCurrentTime metodu ið returnerar ein _string_ við núverandi klokkusletti.

4) Overrida paintComponent metoduna í Board og tekna vha drawString tað sum getCurrentTime í DateTimeSprite returnerar. Positionera tekstin ovast í vinstra horni.

5) Ger ein timara í Board klassanum ið kallar refresh 25 ferð per sekund. 

6) Ger ein nýggjan klassa ið umboðar ein bólt ið eisini arvar (extends) frá Sprite. 

    Ger eina move metodu ið verður kallað av timaranum í Board.
    
    Hvørja ferð move verður kallað, skal bólturin flyta seg 1 pixel niðureftir (x = x + 1). 
    
    Byrjunarpositiónin hjá bóltinum skal vera 50, 50. 
    
    Tekna bóltin vha g.fillArc(50, 50, 20, 20, 0, 360);

