package com.example.oracletest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
https://chartio.com/resources/tutorials/how-to-create-a-user-and-grant-permissions-in-oracle/
https://stackoverflow.com/questions/33330968/error-ora-65096-invalid-common-user-or-role-name-in-oracle

alter session set "_ORACLE_SCRIPT"=true;

CREATE USER oc IDENTIFIED BY MyPassword;
CREATE USER oc_test IDENTIFIED BY MyPassword;

GRANT CONNECT TO oc;
GRANT CONNECT TO oc_test;

GRANT CONNECT, RESOURCE, DBA TO oc;
GRANT CONNECT, RESOURCE, DBA TO oc_test;
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OracletestApplicationTests {

	@Test
	public void contextLoads() {
	}

}
