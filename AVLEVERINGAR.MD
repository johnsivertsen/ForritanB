## AVLEVERING01: CurrentTimeSprite

    Uppgávan skal avleverast í GitHub við at pusha í foldara ForritanB-XXX/AVLEVERING01 í egna github repository. Commit+pusha millum hvørt punkt.

    1) Ger eitt tómt svart vindeyga á stødd 400x300 pixels vha klassum ið arva frá JFrame og JPanel. Kalla JPanel subklassan Board.

    2) Overrida void paintComponent(Graphics g) í Board klassanum. og ger egna tekni metodu ið teknar tekstin "12:34:56" í positión 200, 150. Tekstfarvan skal vera grøn og støddin 20.

    3) Ger ein CurrentTimeSprite klassa ið umboðar eitt sprite av einum klokkusletti.
    Klassin skal hava fylgjandi metodu: getCurrentTime() ið returnerar ein String ið er núverandi klokkuslet. Kann t.d. gerast uppá henda mátan: 
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTimeFormatted = sdf.format(new Date());
        return currentTimeFormatted;
    getCurrentTime má ikki vera static.
    Broyt implementeringina í 2) ið brúkar tekstin "12:34:56" til at brúka tekstin frá CurrentTimeSprite í staðin. Kann t.d. gerast við at kalla uppá hendan mátan: (new CurrentTimeSprite()).getCurrentTime().

    4) Ger ein variabul í Board klassanum við navni currentTimeSprite til at innihalda eitt CurrentTimeSprite objekt. Initialisera tað í Board konstruktaranum. Broyt síðan implementeringina í 3 sum heintar string klokkuslettið frá (new CurrentTimeSprite()).getCurrentTime() til at brúka hetta kallið: currentTimeSprite.getCurrentTime()

    5) Legg fylgjandi attributtar afturat CurrentTimeSprite klassanum: Integer x, Integer y
    Í initialiseringini av currentTimeSprite, set x og y til at vera random genereraði í tí sjónliga umráðinum av vindeyganum. T.d. kann x setast vha fylgjandi:
        currentTimeSprite.x = (new Random()).nextInt(400);
    Skift hard kotaðu x, y virðini í uppgávu 2 út við tey nýggju, random genereraðu.
    
    6) Ger ein timara á Board klassan ið verður triggaður 1 ferð um sekundið. Hvørja fer hann verður triggaður skal hann kalla repaint() metoduna sum Board hevur atgongd til via sín super klassa JPanel.
