package org.chenjingbin.multdemo.service;

import org.chenjingbin.multdemo.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenjb
 * @email 764024742@qq.com
 * @date 2019/7/23 15:03
 */
@Service
public interface PersonService {
    List<Person> selectPersonList();
}
