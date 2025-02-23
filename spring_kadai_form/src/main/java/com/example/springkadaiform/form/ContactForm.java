package com.example.springkadaiform.form;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Component
public class ContactForm {
	
	@NotEmpty(message = "お名前を入力してください。")
	private String name;
	
	@NotEmpty(message = "メールアドレスを入力してください。")
    @Email(message = "メールアドレスの入力形式が正しくありません。")
    private String email;
	
	@NotEmpty(message = "お問い合わせ内容を入力してください。")
    private String message;
	
}
