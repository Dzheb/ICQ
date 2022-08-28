package Model;

import View.Chat;

public abstract class User {

  protected String name;
  protected Chat chatroom;

  public User(String name, Chat chatroom) {
    this.name = name;
    this.chatroom = chatroom;

  }

  public User(String name) {
    this.name = name;

  }

  public void join(Chat chatroom) {
    this.chatroom = chatroom;
  }

  public void printMessage(MessageModel msg) {

    System.out.printf("Чат %s: %s\n", name, msg.text);

  }

  public void sendMsg(String text) {

    var mm = new Text(text);
    chatroom.sendMessage(mm, this);
  }

  public void sendMsg(MessageModel mm) {

    chatroom.sendMessage(mm, this);
  }

  //
  public abstract Object getName();

}
