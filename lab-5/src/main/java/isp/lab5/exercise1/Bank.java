package isp.lab5.exercise1;

import java.util.Arrays;

public class Bank {
    private final Account[] accounts;

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public String executeTransaction(Transaction transaction) {
        return transaction.execute();
    }

    /**
     * Search and return an {@link Account} based on a card id
     *
     * @param cardId the id of the card
     * @return the found {@link Account} having the card with the specified cardId or null if no account found
     */
    public Account getAccountByCardId(String cardId) {
        if (this.accounts != null && this.accounts.length > 0) {
            return Arrays.stream(accounts).filter(account -> account.getCard().getCardId().equals(cardId)).findFirst().orElse(null);
        } else {
            return null;
        }
    }
}
