package View;

import Model.Admin;
import Model.Client;
import Model.MessageModel;
import Model.User;
import Server.Repository;

public abstract class Chat {

  protected Repository repo;
  protected int mesId;

  public Chat(Repository currentRepo) {
    repo = currentRepo;
    mesId = 1;
  }

  public void sendMessage(MessageModel mm, User me) {

    for (int i = 0; i < repo.getCount(); i++) {
      var c = repo.getById(i);
      if (c.getName().equals(me.getName())) {
        mesId++;

        c.printMessage(mm);

      }
    }
  }

  public void appendClient(Client client) {
    System.out.println("\n >>> добавился " + client.getName());
    repo.add(client);

  }

  public void remClient(Admin admin, Client client) {
    System.out.printf("\n >>> Администратор %s удалил из чата %s\n", admin.getName(), client.getName());
    repo.remove(client);

  }

  public int getMessId() {
    return mesId;
  }

}
