package com.example.filesystem.pojo.bo;

/**
 * @author zzy 2023-11-30
 *      移动文件或文件夹
 */
public class MoveFileOrFolderBo {

    private String token;
    private String serverFilename;//文件的绝对路径
    private String path;//路径（"/" + 文件名）

    public MoveFileOrFolderBo() {
    }

    public MoveFileOrFolderBo(String token, String serverFilename, String path) {
        this.token = token;
        this.serverFilename = serverFilename;
        this.path = path;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getServerFilename() {
        return serverFilename;
    }

    public void setServerFilename(String serverFilename) {
        this.serverFilename = serverFilename;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "MoveFileOrFolderBo{" +
                "token='" + token + '\'' +
                ", serverFilename='" + serverFilename + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
