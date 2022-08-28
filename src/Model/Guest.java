package Model;

import View.Chat;

public class Guest extends Client {
  public String name;
  protected Chat chatroom;

  public Guest(String name, Chat chatroom) {
    super(name, chatroom);
    this.name = name;
    this.chatroom = chatroom;

  }

  public Guest(String name) {
    super(name);
    this.name = name;

  }

  @Override
  public void sendMsg(String mm) {
    System.out.println("Гость в чат писать на может!");
  }

  @Override
  public void sendMsg(MessageModel mm) {
    System.out.println("Гость в чат писать на может!");

  }
}
