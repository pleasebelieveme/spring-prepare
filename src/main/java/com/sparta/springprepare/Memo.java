package com.sparta.springprepare;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@RequiredArgsConstructor // final붙은 필드만 생성
public class Memo {
    private String username;
    private String contents;
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo();
        memo.setUsername("believeme");
        System.out.println(memo.getUsername());
    }
}
