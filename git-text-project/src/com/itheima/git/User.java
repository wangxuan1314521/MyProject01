package com.itheima.git;

import java.util.Objects;

/**nihao
 * @author shkstart
 * @create 2023-02-16 18:24
 */
public class User {
    //你好
    private String   id;
    private String brand_name;
    private String company_name;
    private String ordered;

     private String description;

    private String status;

    public User() {
    }

    public User(String id, String brand_name, String company_name, String ordered, String description, String status) {
        this.id = id;
        this.brand_name = brand_name;
        this.company_name = company_name;
        this.ordered = ordered;
        this.description = description;
        this.status = status;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getOrdered() {
        return ordered;
    }

    public void setOrdered(String ordered) {
        this.ordered = ordered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(brand_name, user.brand_name) &&
                Objects.equals(company_name, user.company_name) &&
                Objects.equals(ordered, user.ordered) &&
                Objects.equals(description, user.description) &&
                Objects.equals(status, user.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, brand_name, company_name, ordered, description, status);
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", ordered='" + ordered + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
