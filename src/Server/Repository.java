package Server;

import Model.Client;

public interface  Repository {
  void add(Client user);

  Client getByName(String name);

  Client getById(int id);

  int getCount();

  void remove(Client client);

}

