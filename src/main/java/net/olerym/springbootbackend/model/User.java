package net.olerym.springbootbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "subscriptions_amount", nullable = false)
    private Integer subscriptionsAmount = 0;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    @ElementCollection
    @CollectionTable(name = "user_stack", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "stack")
    private List<String> stack;

    @Column(name = "city")
    private String city;
}
