package org.chenjingbin.multdemo.dao;

import org.chenjingbin.multdemo.entity.Person;

import java.util.List;

/**
 * @author chenjb
 * @email 764024742@qq.com
 * @date 2019/7/23 14:48
 */
public interface PersonMapper {
    public List<Person> selectPersonList();
}
