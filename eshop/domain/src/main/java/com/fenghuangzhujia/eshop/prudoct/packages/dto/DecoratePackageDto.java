package com.fenghuangzhujia.eshop.prudoct.packages.dto;

import java.util.Set;

import com.fenghuangzhujia.eshop.core.brand.dto.BrandDto;
import com.fenghuangzhujia.eshop.core.menu.dto.MenuDto;
import com.fenghuangzhujia.eshop.prudoct.detail.DecorateDetail;
import com.fenghuangzhujia.foundation.core.dto.DtoBaseModel;
import com.fenghuangzhujia.foundation.dics.dto.CategoryItemDto;
import com.fenghuangzhujia.foundation.media.MediaContentDto;

public class DecoratePackageDto extends DtoBaseModel {

	private MenuDto menu;
	private BrandDto brand;
	private String title;
	private Double marketPrice;
	private Double salePrice;
	private Integer housenum;
	private boolean housewarn;
	private Integer warnnum;	
	private String description;
	private String content;
	private MediaContentDto mainPic;
	private MediaContentDto thumbnails;
	private Set<MediaContentDto> pics;	
	private CategoryItemDto houseType;
	private CategoryItemDto decorateType;
	private CategoryItemDto responseType;
	private Double workingDays;	
	private String keywrods;
	private Set<DecorateDetail> details;
	
	public MenuDto getMenu() {
		return menu;
	}
	public void setMenu(MenuDto menu) {
		this.menu = menu;
	}
	public BrandDto getBrand() {
		return brand;
	}
	public void setBrand(BrandDto brand) {
		this.brand = brand;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	public Integer getHousenum() {
		return housenum;
	}
	public void setHousenum(Integer housenum) {
		this.housenum = housenum;
	}
	public boolean isHousewarn() {
		return housewarn;
	}
	public void setHousewarn(boolean housewarn) {
		this.housewarn = housewarn;
	}
	public Integer getWarnnum() {
		return warnnum;
	}
	public void setWarnnum(Integer warnnum) {
		this.warnnum = warnnum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public MediaContentDto getMainPic() {
		return mainPic;
	}
	public void setMainPic(MediaContentDto mainPic) {
		this.mainPic = mainPic;
	}
	public MediaContentDto getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(MediaContentDto thumbnails) {
		this.thumbnails = thumbnails;
	}
	public Set<MediaContentDto> getPics() {
		return pics;
	}
	public void setPics(Set<MediaContentDto> pics) {
		this.pics = pics;
	}
	public CategoryItemDto getHouseType() {
		return houseType;
	}
	public void setHouseType(CategoryItemDto houseType) {
		this.houseType = houseType;
	}
	public CategoryItemDto getDecorateType() {
		return decorateType;
	}
	public void setDecorateType(CategoryItemDto decorateType) {
		this.decorateType = decorateType;
	}
	public CategoryItemDto getResponseType() {
		return responseType;
	}
	public void setResponseType(CategoryItemDto responseType) {
		this.responseType = responseType;
	}
	public Double getWorkingDays() {
		return workingDays;
	}
	public void setWorkingDays(Double workingDays) {
		this.workingDays = workingDays;
	}
	public String getKeywrods() {
		return keywrods;
	}
	public void setKeywrods(String keywrods) {
		this.keywrods = keywrods;
	}
	public Set<DecorateDetail> getDetails() {
		return details;
	}
	public void setDetails(Set<DecorateDetail> details) {
		this.details = details;
	}
}
