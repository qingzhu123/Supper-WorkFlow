package com.example.demo.workflow;


import com.example.demo.workflow.approver.Dept;
import com.example.demo.workflow.approver.User;
import com.example.demo.workflow.node.Node;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Workflow {
    private String id;
    private String name;
    private String formId;
    private List<Node> nodes;
    private int version;


}


