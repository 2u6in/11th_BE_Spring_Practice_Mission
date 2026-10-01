package example.umc_11th_web_spring.dto;

public class BookReqDTO {

    public record GetRentalDTO(
            int bookId,
            int userId
    ){}

}
