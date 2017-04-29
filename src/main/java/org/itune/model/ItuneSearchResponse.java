package org.itune.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Geetha Gowda
 * @date 04/29/2017
 **/
public class ItuneSearchResponse {

	private int resultCount;
	private String errorMessage;
	private List<Result> results;

	public int getResultCount() {
		return resultCount;
	}

	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public static class Result {

		private Double trackPrice;
		private Date releaseDate;
		private Integer discCount;
		private Integer discNumber;
		private Integer trackCount;
		private Integer trackNumber;
		private Long trackTimeMillis;
		private String country;
		private String currency;
		private String primaryGenreName;
		private String artistViewUrl;
		private String trackViewUrl;
		private String trackRentalPrice;
		private String trackHdRentalPrice;
		private String wrapperType;
		private String kind;
		private String artistId;
		private String collectionId;
		private String trackId;
		private String artistName;
		private String collectionName;
		private String trackName;
		private String collectionCensoredName;
		private String trackCensoredName;
		private String collectionViewUrl;
		private String feedUrl;
		private String artworkUrl30;
		private String artworkUrl60;
		private String artworkUrl100;
		private Double collectionPrice;
		private double collectionHdPrice;
		private String trackHdPrice;
		private String trackExplicitness;
		private String contentAdvisoryRating;
		private String artworkUrl600;
		private List<String> genreIds;
		private String collectionArtistId;
		private String collectionArtistName;
		private String collectionArtistViewUrl;
		private String isStreamable;
		private String shortDescription;
		private String longDescription;
		private String hasITunesExtras;
		private List<String> genres;
		private String collectionExplicitness;
		@JsonIgnore
		private String previewUrl;

		public String getTrackId() {
			return trackId;
		}

		public void setTrackId(String trackId) {
			this.trackId = trackId;
		}

		public String getCollectionViewUrl() {
			return collectionViewUrl;
		}

		public void setCollectionViewUrl(String collectionViewUrl) {
			this.collectionViewUrl = collectionViewUrl;
		}

		public String getFeedUrl() {
			return feedUrl;
		}

		public void setFeedUrl(String feedUrl) {
			this.feedUrl = feedUrl;
		}

		public String getArtworkUrl30() {
			return artworkUrl30;
		}

		public void setArtworkUrl30(String artworkUrl30) {
			this.artworkUrl30 = artworkUrl30;
		}

		public String getArtworkUrl60() {
			return artworkUrl60;
		}

		public void setArtworkUrl60(String artworkUrl60) {
			this.artworkUrl60 = artworkUrl60;
		}

		public String getArtworkUrl100() {
			return artworkUrl100;
		}

		public void setArtworkUrl100(String artworkUrl100) {
			this.artworkUrl100 = artworkUrl100;
		}

		public String getPreviewUrl() {
			return previewUrl;
		}

		public void setPreviewUrl(String previewUrl) {
			this.previewUrl = previewUrl;
		}

		public String getWrapperType() {
			return wrapperType;
		}

		public void setWrapperType(String wrapperType) {
			this.wrapperType = wrapperType;
		}

		public String getKind() {
			return kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getArtistId() {
			return artistId;
		}

		public void setArtistId(String artistId) {
			this.artistId = artistId;
		}

		public String getCollectionId() {
			return collectionId;
		}

		public void setCollectionId(String collectionId) {
			this.collectionId = collectionId;
		}

		public String getArtistName() {
			return artistName;
		}

		public void setArtistName(String artistName) {
			this.artistName = artistName;
		}

		public String getCollectionName() {
			return collectionName;
		}

		public void setCollectionName(String collectionName) {
			this.collectionName = collectionName;
		}

		public String getTrackName() {
			return trackName;
		}

		public void setTrackName(String trackName) {
			this.trackName = trackName;
		}

		public String getCollectionCensoredName() {
			return collectionCensoredName;
		}

		public void setCollectionCensoredName(String collectionCensoredName) {
			this.collectionCensoredName = collectionCensoredName;
		}

		public String getTrackCensoredName() {
			return trackCensoredName;
		}

		public void setTrackCensoredName(String trackCensoredName) {
			this.trackCensoredName = trackCensoredName;
		}

		public Double getCollectionPrice() {
			return collectionPrice;
		}

		public void setCollectionPrice(Double collectionPrice) {
			this.collectionPrice = collectionPrice;
		}

		public Double getTrackPrice() {
			return trackPrice;
		}

		public void setTrackPrice(Double trackPrice) {
			this.trackPrice = trackPrice;
		}

		public Date getReleaseDate() {
			return releaseDate;
		}

		public void setReleaseDate(Date releaseDate) {
			this.releaseDate = releaseDate;
		}

		public Integer getDiscCount() {
			return discCount;
		}

		public void setDiscCount(Integer discCount) {
			this.discCount = discCount;
		}

		public Integer getDiscNumber() {
			return discNumber;
		}

		public void setDiscNumber(Integer discNumber) {
			this.discNumber = discNumber;
		}

		public Integer getTrackCount() {
			return trackCount;
		}

		public void setTrackCount(Integer trackCount) {
			this.trackCount = trackCount;
		}

		public Integer getTrackNumber() {
			return trackNumber;
		}

		public void setTrackNumber(Integer trackNumber) {
			this.trackNumber = trackNumber;
		}

		public Long getTrackTimeMillis() {
			return trackTimeMillis;
		}

		public void setTrackTimeMillis(Long trackTimeMillis) {
			this.trackTimeMillis = trackTimeMillis;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getCurrency() {
			return currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getPrimaryGenreName() {
			return primaryGenreName;
		}

		public void setPrimaryGenreName(String primaryGenreName) {
			this.primaryGenreName = primaryGenreName;
		}

		public String getArtistViewUrl() {
			return artistViewUrl;
		}

		public void setArtistViewUrl(String artistViewUrl) {
			this.artistViewUrl = artistViewUrl;
		}

		public String getTrackViewUrl() {
			return trackViewUrl;
		}

		public void setTrackViewUrl(String trackViewUrl) {
			this.trackViewUrl = trackViewUrl;
		}

		public double getCollectionHdPrice() {
			return collectionHdPrice;
		}

		public void setCollectionHdPrice(double collectionHdPrice) {
			this.collectionHdPrice = collectionHdPrice;
		}

		public String getTrackHdRentalPrice() {
			return trackHdRentalPrice;
		}

		public void setTrackHdRentalPrice(String trackHdRentalPrice) {
			this.trackHdRentalPrice = trackHdRentalPrice;
		}

		public String getHasITunesExtras() {
			return hasITunesExtras;
		}

		public void setHasITunesExtras(String hasITunesExtras) {
			this.hasITunesExtras = hasITunesExtras;
		}

		public String getLongDescription() {
			return longDescription;
		}

		public void setLongDescription(String longDescription) {
			this.longDescription = longDescription;
		}

		public String getShortDescription() {
			return shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getIsStreamable() {
			return isStreamable;
		}

		public void setIsStreamable(String isStreamable) {
			this.isStreamable = isStreamable;
		}

		public String getCollectionArtistViewUrl() {
			return collectionArtistViewUrl;
		}

		public void setCollectionArtistViewUrl(String collectionArtistViewUrl) {
			this.collectionArtistViewUrl = collectionArtistViewUrl;
		}

		public String getCollectionArtistName() {
			return collectionArtistName;
		}

		public void setCollectionArtistName(String collectionArtistName) {
			this.collectionArtistName = collectionArtistName;
		}

		public String getCollectionArtistId() {
			return collectionArtistId;
		}

		public void setCollectionArtistId(String collectionArtistId) {
			this.collectionArtistId = collectionArtistId;
		}

		public List<String> getGenreIds() {
			return genreIds;
		}

		public void setGenreIds(List<String> genreIds) {
			this.genreIds = genreIds;
		}

		public List<String> getGenres() {
			return genres;
		}

		public void setGenres(List<String> genres) {
			this.genres = genres;
		}

		public String getArtworkUrl600() {
			return artworkUrl600;
		}

		public void setArtworkUrl600(String artworkUrl600) {
			this.artworkUrl600 = artworkUrl600;
		}

		public String getContentAdvisoryRating() {
			return contentAdvisoryRating;
		}

		public void setContentAdvisoryRating(String contentAdvisoryRating) {
			this.contentAdvisoryRating = contentAdvisoryRating;
		}

		public String getTrackExplicitness() {
			return trackExplicitness;
		}

		public void setTrackExplicitness(String trackExplicitness) {
			this.trackExplicitness = trackExplicitness;
		}

		public String getCollectionExplicitness() {
			return collectionExplicitness;
		}

		public void setCollectionExplicitness(String collectionExplicitness) {
			this.collectionExplicitness = collectionExplicitness;
		}

		public String getTrackHdPrice() {
			return trackHdPrice;
		}

		public void setTrackHdPrice(String trackHdPrice) {
			this.trackHdPrice = trackHdPrice;
		}

		public String getTrackRentalPrice() {
			return trackRentalPrice;
		}

		public void setTrackRentalPrice(String trackRentalPrice) {
			this.trackRentalPrice = trackRentalPrice;
		}

	}

}