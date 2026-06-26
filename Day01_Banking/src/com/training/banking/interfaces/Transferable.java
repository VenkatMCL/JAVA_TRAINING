package com.training.banking.interfaces;
import com.training.banking.model.Account;
public interface Transferable {
	  void transfer(Account target,
              double amount);

}
