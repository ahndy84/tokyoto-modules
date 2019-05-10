package com.blogcode.repository;

import com.blogcode.domain.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;

	@Test
	public void add() {
		memberRepository.save(new Member("ahndy84", "ahndy84@gmail.com"));
		List<Member> memberList = memberRepository.findAll();
		assertThat(memberList.size(), is(1));
	}
}
