package nl.novi.uitproberen3.dtos;

import javax.persistence.Column;

public class UserDto {

    private Long id;

    // verschil met @NotNull ??)
    @Column(nullable = false, unique = true)
    public String username;

    @Column(nullable = false, length = 50)
    public String password;

    public Boolean enabled = true;

    public String apikey;

    public String email;

    public UserDto() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getApikey() {
        return apikey;
    }
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
