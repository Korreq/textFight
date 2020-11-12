package Magia;

public class TablicaMagii {

    public Magia fire1 = new Magia("Ognista włócznia","fire",1,20,"jedna kolumna przeciwników");
    public Magia fire2 = new Magia("Sciana ognia","fire",2,30,"jeden rząd przeciwników");
    public Magia fire3 = new Magia("Deszcz ognia","fire",3,40,"wszyscy przeciwnicy");

    public Magia water1 = new Magia("Kropla życia","water",1,0,"jeden sojusznik");
    public Magia water2 = new Magia("Mgła","water",2,0,"jeden sojusznik");
    public Magia water3 = new Magia("Fala życia","water",3,0,"wszyscy sojusznicy");

    public Magia wind1 = new Magia("Świst wiatru","wind",1,25,"jeden przeciwnik");
    public Magia wind2 = new Magia("Ciepła bryza","wind",2,0,"jeden sojusznik");
    public Magia wind3 = new Magia("Trąba powietrzna","wind",3,35,"wszyscy wrogowie");

    public Magia earth1 = new Magia("Kokon","earth",1,0,"jeden sojusznik");
    public Magia earth2 = new Magia("Pnącza","earth",2,0,"jeden przeciwnik");
    public Magia earth3 = new Magia("Całun flory","earth",3,0,"wszyscy sojusznicy");

    public Magia light1 = new Magia("Fortuna","light",1,0,"");
    public Magia light2 = new Magia("Egida","light",2,0,"");
    public Magia light3 = new Magia("Chwała","light",3,0,"");

    public Magia blood1 = new Magia("Krwawy akt","blood",1,0,"jeden przeciwnik");
    public Magia blood2 = new Magia("Krwawa więź","blood",2,0,"dwóch przeciwników");
    public Magia blood3 = new Magia("Krwawy rytuał","blood",3,0,"wszyscy przeciwnicy");

    public Magia thunder1 = new Magia("Piorun Strzelisty","thunder",1,30,"jeden przeciwnik");
    public Magia thunder2 = new Magia("Strzelista włócznia","thunder",2,35,"jedna kolumna przeciwników");
    public Magia thunder3 = new Magia("Gniew Magnira","thunder",3,55,"jeden przeciwnik");


    public Magia[] magiaognia ={fire1,fire2,fire3};
    public Magia[] magiawody ={water1,water2,water3};
    public Magia[] magiawiatru ={wind1,wind2,wind3};
    public Magia[] magiaziemi ={earth1,earth2,earth3};
    public Magia[] magiaswiatła ={light1,light2,light3};
    public Magia[] magiakrwi ={blood1,blood2,blood3};
    public Magia[] magiabłyskawica ={thunder1,thunder2,thunder3};

}
