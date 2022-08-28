
import Model.Admin;
import Model.Audio;
import Model.Client;
import Model.Guest;
import Model.Video;
import Server.Forum1;
import Server.Forum2;
import View.ICQ1;
import View.ICQ2;

public class App {

  public static void main(String[] args) {
    System.out.println("Чат №1");
    System.out.println("----------------------------------------");
    ICQ1 icq1 = new ICQ1(new Forum1());
    Client client1 = new Client("Вася", icq1);
    Client client2 = new Client("Маша", icq1);
    Guest client3 = new Guest("Марина", icq1);
    Client client4 = new Client("Вальдемар", icq1);
    client1.sendMsg("hello world!");
    client2.sendMsg(new Audio("ку-ку!"));
    client3.sendMsg(new Audio("ку-ку!"));
    client4.sendMsg(new Video("Привет всем!"));
    Admin admin = new Admin("Иван", icq1);
    admin.removeClient(client4);
    admin.sendMsg("Вот так!");
    System.out.println("");
    //
    System.out.println("Чат №2");
    System.out.println("----------------------------------------");
    ICQ2 icq2 = new ICQ2(new Forum2());
    Client client5 = new Client("Иоанн", icq2);
    Client client6 = new Client("Ираклий", icq2);
    client5.sendMsg(new Audio("ку-ку!"));
    client6.sendMsg(new Video("Привет всем!"));
  }
}
