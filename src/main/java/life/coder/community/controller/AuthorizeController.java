package life.coder.community.controller;

import life.coder.community.dto.AccessTokenDTO;
import life.coder.community.dto.GitHubUser;
import life.coder.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;
    @GetMapping("/callback")
    public String callback(@RequestParam(name="code")String code,@RequestParam(name="state")String state){
        AccessTokenDTO accessTokenDTO =new AccessTokenDTO();
        accessTokenDTO.setClient_id("682057b4948ebbeb6182");
        accessTokenDTO.setClient_secret("674bd0c3564114ede63ea036c4befd42bc2c2794");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setState(state);
        String accessToken= githubProvider.getAccessToken(accessTokenDTO);
        GitHubUser user=githubProvider.getUser(accessToken);
        System.out.println(user.getLogin());
        return "index";
    }
}
