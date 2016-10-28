package cn.lightsky.infiniteindicator;

/**
 * Created by xushuai on 2014/12/25.
 */
public class PageInfo {
	private String data;
	private String url;
	private String picLink;
	private Integer drawableRes;

	public PageInfo(String data, Integer drawableRes) {
		this.data = data;
		this.drawableRes = drawableRes;
	}

	public PageInfo(String data, String url) {
		this.data = data;
		this.url = url;
	}

	public PageInfo(String data, String url, String picLink) {
		this.data = data;
		this.url = url;
		this.picLink = picLink;
	}

	public Integer getDrawableRes() {
		return drawableRes;
	}

	public void setDrawableRes(Integer drawableRes) {
		this.drawableRes = drawableRes;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPicLink() {
		return picLink;
	}

	public void setPicLink(String picLink) {
		this.picLink = picLink;
	}

}
