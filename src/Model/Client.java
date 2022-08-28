package Model;

import View.Chat;

public class Client extends User {
  protected String name;
  protected Chat chatroom;

  public Client(String name, Chat chatroom) {
    super(name, chatroom);
    this.name = name;
    this.chatroom = chatroom;
    this.chatroom.appendClient(this);
  }

  public Client(String name) {
    super(name);
    this.name = name;

  }

  public Chat getChatroom() {
    return chatroom;
  }

  public String getName() {
    return name;
  }

}
