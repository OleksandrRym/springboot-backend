package net.olerym.springbootbackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.olerym.springbootbackend.model.User;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private String username;
    private String avatarUrl;
    private Integer subscriptionsAmount;
    private String firstName;
    private String lastName;
    private String city;

    // Конструктор, який приймає об'єкт User
    public UserDTO(User user) {
        this.username = user.getUsername();
        this.avatarUrl = user.getAvatarUrl();
        this.subscriptionsAmount = user.getSubscriptionsAmount();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.city = user.getCity();
    }
}
