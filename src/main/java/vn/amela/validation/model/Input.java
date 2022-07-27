package vn.amela.validation.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Input {
    @NotNull
    @NotEmpty(message = "Không được để trống ô họ tên")
    private String name;
    @NotBlank(message = "Không được để trông ô địa chỉ")
    private String address;
    @Pattern(regexp = "^0\\d{9}$", message = "Nhập đúng định dạng của số điện thoại")
    private String number;

    public Input(){

    }
    public Input(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Input{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
