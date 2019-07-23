package org.chenjingbin.multdemo.service.impl;

import org.chenjingbin.multdemo.dao.PersonMapper;
import org.chenjingbin.multdemo.entity.Person;
import org.chenjingbin.multdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author chenjb
 * @email 764024742@qq.com
 * @date 2019/7/23 15:05
 */
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public List<Person> selectPersonList() {
        return personMapper.selectPersonList();
    }
}
