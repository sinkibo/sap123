/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2018 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.training.services;

import java.util.List;

import org.training.enums.FaqArticleStatus;

import com.training.model.FaqArticleModel;
import com.training.model.FaqTopicModel;


/**
 *
 */
public interface FaqService
{
	public FaqTopicModel getFaqTopic(final String code);

	public List<FaqArticleModel> getFaqAnswers(final FaqArticleStatus status);

	public List<FaqArticleModel> getFaqAnswers(final String keyword);

}
