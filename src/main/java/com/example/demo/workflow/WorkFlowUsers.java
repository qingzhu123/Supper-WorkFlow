package com.example.demo.workflow;



import java.util.HashMap;
import java.util.Map;

/**
 * 工作流用户类，用于存储业务中的用户、角色、部门和对应的工作流用户。
 * 在运行前解析业务中的用户、角色、部门，建立映射关系，方便在运行时查找用户。
 */
public class WorkFlowUsers {

    // 用户、角色、部门和对应的工作流用户的映射关系
    private Map<String, String> userMap;
    private Map<String, String> roleMap;
    private Map<String, String> deptMap;

    public WorkFlowUsers() {
        this.userMap = new HashMap<>();
        this.roleMap = new HashMap<>();
        this.deptMap = new HashMap<>();
    }

    /**
     * 添加业务中的用户，并为其创建对应的工作流用户。
     * @param userId 业务中的用户ID
     * @param wfUserId 对应的工作流用户ID
     */
    public void addUser(String userId, String wfUserId) {
        userMap.put(userId, wfUserId);
    }

    /**
     * 添加业务中的角色，并为其创建对应的工作流用户。
     * @param roleId 业务中的角色ID
     * @param wfRoleId 对应的工作流用户ID
     */
    public void addRole(String roleId, String wfRoleId) {
        roleMap.put(roleId, wfRoleId);
    }

    /**
     * 添加业务中的部门，并为其创建对应的工作流用户。
     * @param deptId 业务中的部门ID
     * @param wfDeptId 对应的工作流用户ID
     */
    public void addDept(String deptId, String wfDeptId) {
        deptMap.put(deptId, wfDeptId);
    }

    /**
     * 根据业务中的用户ID查找对应的工作流用户ID。
     * @param userId 业务中的用户ID
     * @return 对应的工作流用户ID
     */
    public String findUser(String userId) {
        return userMap.get(userId);
    }

    /**
     * 根据业务中的角色ID查找对应的工作流用户ID。
     * @param roleId 业务中的角色ID
     * @return 对应的工作流用户ID
     */
    public String findRole(String roleId) {
        return roleMap.get(roleId);
    }

    /**
     * 根据业务中的部门ID查找对应的工作流用户ID。
     * @param deptId 业务中的部门ID
     * @return 对应的工作流用户ID
     */
    public String findDept(String deptId) {
        return deptMap.get(deptId);
    }
}
