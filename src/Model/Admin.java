package Model;

import View.Chat;

public class Admin extends Client {

  public Admin(String name, Chat chatroom) {
    super(name, chatroom);

  }

  public void removeClient(Client name) {
    chatroom.remClient(this, name);
  }
}