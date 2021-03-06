package org.csci4050.bookstore.Bookstore.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@NoArgsConstructor
public class User implements Serializable {
    private String username;
    private String password;
    private String email;
    private String role;
    private String imageUrl;

    public static final String USERNAME_COL = "username";
    public static final String PASSWORD_COL = "password";
    public static final String EMAIL_COL = "email";
    public static final String IMAGE_URL_COL = "image_url";
}
