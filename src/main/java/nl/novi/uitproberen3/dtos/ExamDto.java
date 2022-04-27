package nl.novi.uitproberen3.dtos;

public class ExamDto {
    private Long id;
    private String userInput;

    public ExamDto() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUserInput() {
        return userInput;
    }
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
