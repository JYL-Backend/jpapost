package jappost.jpapost.domain;

import jappost.jpapost.domain.posts.Posts;
import jappost.jpapost.domain.posts.PostsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @Test
    public void 게시글저장_불러오기() throws Exception {
        //given
        String title = "테스트 제목";
        String content = "테스트 본문";

        Long id = postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("wnsdud2336@naver.com")
                .build()).getId();

        //when
        Posts posts = postsRepository.findById(id).get();

        //then
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
        assertThat(posts.getAuthor()).isEqualTo("wnsdud2336@naver.com");
    }

}