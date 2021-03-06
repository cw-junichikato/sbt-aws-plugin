package org.sisioh.sbt.aws

import com.amazonaws.services.elasticbeanstalk.model.{ ConfigurationOptionSetting, OptionSpecification }

case class EbConfigurationTemplate(name: String, description: String,
                                   solutionStackName: String,
                                   optionSettings: Seq[ConfigurationOptionSetting],
                                   optionsToRemoves: Seq[OptionSpecification],
                                   recreate: Boolean)
