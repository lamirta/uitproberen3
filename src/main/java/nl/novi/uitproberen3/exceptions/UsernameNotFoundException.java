package nl.novi.uitproberen3.exceptions;

public class UsernameNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UsernameNotFoundException(String username) {
        super("Kan leerling " + username + " niet vinden.");
    }

}
