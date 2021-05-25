package Tiger0213

import Tiger0213.buildTypes.*
import Tiger0213.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0213")
    name = "Tiger0213"

    vcsRoot(Tiger0213_cVCSroot)

    buildType(Tiger0213_Hi0)
    buildType(Tiger0213_Hi3)
    buildType(Tiger0213_Hi1)
    buildType(Tiger0213_Hi2)
})
